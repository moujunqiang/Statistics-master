package experment.zju.statistics;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import experment.zju.statistics.db.UserDao;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 请输入账号/手机号
     */
    private EditText mUname;
    private ImageView mIgvClear;
    /**
     * @={data.psd}
     */
    private EditText mPword;
    private CheckBox mToggleShowPwd;

    /**
     * 登录
     */
    private Button mSubmit;
    /**
     * 忘记密码
     */
    private LinearLayout mLlPhoneRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        mUname = (EditText) findViewById(R.id.uname);
        mIgvClear = (ImageView) findViewById(R.id.igvClear);
        mPword = (EditText) findViewById(R.id.pword);
        mToggleShowPwd = (CheckBox) findViewById(R.id.toggle_show_pwd);
        mSubmit = (Button) findViewById(R.id.submit);
        mSubmit.setOnClickListener(this);
        mLlPhoneRegister = (LinearLayout) findViewById(R.id.ll_register);
        mLlPhoneRegister.setOnClickListener(this);
        mToggleShowPwd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    mPword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                mPword.setSelection(mPword.getText().toString().length());
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.submit:
                login();
                break;
            case R.id.ll_register:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
        }
    }

    public void login() {

        UserDao userdao = new UserDao(LoginActivity.this);
        Cursor cursor = userdao.query(mUname.getText().toString(), mPword.getText().toString());
        if (cursor.moveToNext()) {
           getSharedPreferences("login", MODE_PRIVATE).edit().putBoolean("login", true);

            // 处理登录
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            cursor.close();
            finish();
        } else {
            Toast.makeText(LoginActivity.this, "密码验证失败，请重新验证登录", Toast.LENGTH_SHORT).show();
        }

    }


}