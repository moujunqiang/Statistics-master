package experment.zju.statistics;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import experment.zju.statistics.db.UserDao;


/**
 * desc   : 注册
 */
public final class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mPasswordView1;
    EditText mPasswordView2;
    EditText mEtName;
    Button mCommitView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mPasswordView2 = findViewById(R.id.et_password_reset_password2);
        mPasswordView1 = findViewById(R.id.et_password_reset_password1);
        mEtName = findViewById(R.id.et_password_old);
        mCommitView = findViewById(R.id.btn_password_reset_commit);
        mCommitView.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_password_reset_commit:
                if (TextUtils.isEmpty(mEtName.getText().toString())) {
                    Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(mPasswordView1.getText().toString())) {
                    Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(mPasswordView2.getText().toString())) {
                    Toast.makeText(this, "请输入再次输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!mPasswordView1.getText().toString().equals(mPasswordView2.getText().toString())) {
                    Toast.makeText(this, "两次输入密码不一致", Toast.LENGTH_SHORT).show();
                    return;
                }
                UserDao userdao = new UserDao(this);

                Cursor cursor = userdao.query(mEtName.getText().toString(), mPasswordView1.getText().toString());
                if (cursor.moveToNext()) {
                    Toast.makeText(getApplicationContext(), "该用户已被注册，请重新输入", Toast.LENGTH_LONG).show();
                } else {
                    userdao.insertUser(mEtName.getText().toString(), mPasswordView1.getText().toString());
                    cursor.close();
                    Toast.makeText(getApplicationContext(), "用户注册成功，请前往登录", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    finish();
                }

                break;

        }
    }
}