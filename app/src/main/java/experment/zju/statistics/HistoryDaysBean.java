package experment.zju.statistics;


import java.util.List;

public class HistoryDaysBean {

    /**
     * reason : success
     * result : [{"day":"12/3","date":"1552年12月03日","title":"耶稣会创始人之一圣方济各·沙勿略去世","e_id":"13464"},{"day":"12/3","date":"1795年12月03日","title":"\u201c邮票之父\u201d罗兰·希尔爵士出生","e_id":"13465"},{"day":"12/3","date":"1800年12月03日","title":"霍恩林登战役爆发","e_id":"13466"},{"day":"12/3","date":"1857年12月03日","title":"波兰作家约瑟夫·康拉德诞辰","e_id":"13467"},{"day":"12/3","date":"1859年12月03日","title":"日本共产党的创始人片山潜诞辰","e_id":"13468"},{"day":"12/3","date":"1863年12月03日","title":"曾国藩委派容闳出洋购买机器","e_id":"13469"},{"day":"12/3","date":"1877年12月03日","title":"近代著名学者王国维诞辰","e_id":"13470"},{"day":"12/3","date":"1894年12月03日","title":"英国文学家、《金银岛》作者斯蒂文森逝世","e_id":"13471"},{"day":"12/3","date":"1907年12月03日","title":"罗斯福主张以庚子赔款援助中国教育","e_id":"13472"},{"day":"12/3","date":"1919年12月03日","title":"法国印象主义大画家雷诺阿去世","e_id":"13473"},{"day":"12/3","date":"1943年12月03日","title":"中日在常德激战","e_id":"13474"},{"day":"12/3","date":"1944年12月03日","title":"希腊内战爆发","e_id":"13475"},{"day":"12/3","date":"1948年12月03日","title":"江亚轮惨案","e_id":"13476"},{"day":"12/3","date":"1953年12月03日","title":"冷冻精子进行人工授精首获成功","e_id":"13477"},{"day":"12/3","date":"1971年12月03日","title":"印度对巴基斯坦发动全面进攻","e_id":"13478"},{"day":"12/3","date":"1973年12月03日","title":"南朝鲜朴正熙集团被迫宣布\u201c内阁改组\u201d","e_id":"13479"},{"day":"12/3","date":"1979年12月03日","title":"世界协调时间取代格林威治准时间","e_id":"13480"},{"day":"12/3","date":"1982年12月03日","title":"联合国大会通过《关于残疾人的世界行动纲领》","e_id":"13481"},{"day":"12/3","date":"1982年12月03日","title":"第九届亚运会闭幕(中国61金,总数首次居于第一位)","e_id":"13482"},{"day":"12/3","date":"1984年12月03日","title":"法国首次举行使用微机比赛","e_id":"13483"},{"day":"12/3","date":"1984年12月03日","title":"印度博帕尔事件","e_id":"13484"},{"day":"12/3","date":"1985年12月03日","title":"我国第一条货轮海运邮路开通","e_id":"13485"},{"day":"12/3","date":"1986年12月03日","title":"知名爱国人士王宽诚逝世","e_id":"13486"},{"day":"12/3","date":"1988年12月03日","title":"北京首批私营企业获准营业执照","e_id":"13487"},{"day":"12/3","date":"1989年12月03日","title":"世界首例肝心肾移植成功","e_id":"13488"},{"day":"12/3","date":"1990年12月03日","title":"德国统一后首次大选科尔继续担任总理","e_id":"13489"},{"day":"12/3","date":"1990年12月03日","title":"美国两飞机在机场相撞","e_id":"13490"},{"day":"12/3","date":"1996年12月03日","title":"日本头号通辑犯林泰男落网","e_id":"13491"},{"day":"12/3","date":"1997年12月03日","title":"平遥古城列入世界文化遗产名录","e_id":"13492"},{"day":"12/3","date":"1998年12月03日","title":"人类首次徒步穿越雅鲁藏布大峡谷","e_id":"13493"},{"day":"12/3","date":"1999年12月03日","title":"神秘大火烧死美国亿万富翁","e_id":"13494"},{"day":"12/3","date":"2002年12月03日","title":"我国获得2010年世博会举办权","e_id":"13495"},{"day":"12/3","date":"2004年12月03日","title":"国际数学泰斗陈省身逝世","e_id":"13496"},{"day":"12/3","date":"2010年12月03日","title":"NASA发现生命第七元素\u2014\u2014砷","e_id":"13497"},{"day":"12/3","date":"2015年12月03日","title":"互联网金融e租宝被查 吸金700亿级金融怪兽","e_id":"13498"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * day : 12/3
         * date : 1552年12月03日
         * title : 耶稣会创始人之一圣方济各·沙勿略去世
         * e_id : 13464
         */

        private String day;
        private String date;
        private String title;
        private String e_id;

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getE_id() {
            return e_id;
        }

        public void setE_id(String e_id) {
            this.e_id = e_id;
        }
    }
}
