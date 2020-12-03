package experment.zju.statistics;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryHolder> {
    private List<HistoryDaysBean.ResultBean> historyDaysBeans;

    public void setHistoryDaysBeans(List<HistoryDaysBean.ResultBean> historyDaysBeans) {
        this.historyDaysBeans = historyDaysBeans;
    }

    @NonNull
    @Override
    public HistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history_days, null, false);
        return new HistoryHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryHolder holder, int position) {
        HistoryDaysBean.ResultBean historyDaysBean = historyDaysBeans.get(position);
        holder.tvName.setText(historyDaysBean.getTitle());
        holder.tvDate.setText(historyDaysBean.getDate());

    }

    @Override
    public int getItemCount() {
        return historyDaysBeans == null ? 0 : historyDaysBeans.size();
    }

    public class HistoryHolder extends RecyclerView.ViewHolder {

        private TextView tvName, tvDate;

        public HistoryHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_history_title);
            tvDate = itemView.findViewById(R.id.tv_history_date);

        }
    }
}
