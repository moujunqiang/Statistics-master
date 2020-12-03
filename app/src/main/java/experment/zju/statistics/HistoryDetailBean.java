package experment.zju.statistics;

import java.util.List;

public class HistoryDetailBean {

    /**
     * reason : success
     * result : [{"e_id":"13464","title":"耶稣会创始人之一圣方济各·沙勿略去世","content":"    在466年前的今天，1552年12月3日 (农历冬月十八)，耶稣会创始人之一圣方济各·沙勿略去世。\r\n    圣方济·沙勿略(又译圣方济·萨威，西班牙语: San Francisco Javier， 英文: St. Francis of Xavier，1506年4月7日（距今512年）-1552年12月3日)是耶稣会创始人之一，首先将天主教传播到亚洲的马六甲和日本。天主教会称之为\u201c历史上最伟大的传教士\u201d；是\u201c传教士的主保\u201d。 \r\n    沙勿略为中国、日本，果阿及澳门两个教区之主保，瞻礼定于每年12月3日。 \r\n    点评：传教史上很有名的人物，利玛窦中国札记里也有相当部分提及。\r\n\r\n","picNo":"1","picUrl":[{"pic_title":"","id":1,"url":"http://images.juheapi.com/history/13464_1.jpg"}]}]
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
         * e_id : 13464
         * title : 耶稣会创始人之一圣方济各·沙勿略去世
         * content :     在466年前的今天，1552年12月3日 (农历冬月十八)，耶稣会创始人之一圣方济各·沙勿略去世。
         圣方济·沙勿略(又译圣方济·萨威，西班牙语: San Francisco Javier， 英文: St. Francis of Xavier，1506年4月7日（距今512年）-1552年12月3日)是耶稣会创始人之一，首先将天主教传播到亚洲的马六甲和日本。天主教会称之为“历史上最伟大的传教士”；是“传教士的主保”。
         沙勿略为中国、日本，果阿及澳门两个教区之主保，瞻礼定于每年12月3日。
         点评：传教史上很有名的人物，利玛窦中国札记里也有相当部分提及。
         * picNo : 1
         * picUrl : [{"pic_title":"","id":1,"url":"http://images.juheapi.com/history/13464_1.jpg"}]
         */

        private String e_id;
        private String title;
        private String content;
        private String picNo;
        private List<PicUrlBean> picUrl;

        public String getE_id() {
            return e_id;
        }

        public void setE_id(String e_id) {
            this.e_id = e_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPicNo() {
            return picNo;
        }

        public void setPicNo(String picNo) {
            this.picNo = picNo;
        }

        public List<PicUrlBean> getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(List<PicUrlBean> picUrl) {
            this.picUrl = picUrl;
        }

        public static class PicUrlBean {
            /**
             * pic_title :
             * id : 1
             * url : http://images.juheapi.com/history/13464_1.jpg
             */

            private String pic_title;
            private int id;
            private String url;

            public String getPic_title() {
                return pic_title;
            }

            public void setPic_title(String pic_title) {
                this.pic_title = pic_title;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
