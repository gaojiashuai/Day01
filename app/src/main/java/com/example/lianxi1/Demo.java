package com.example.lianxi1;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.List;

/**
 * Created by 你瞅啥 on 2017/10/12.
 */
public class Demo {

    /**
     * date : 20171012
     * message : Success !
     * status : 200
     * city : 北京
     * count : 49
     * data : {"shidu":"48%","pm25":9,"pm10":30,"quality":"优","wendu":"9","ganmao":"各类人群可自由活动","yesterday":{"date":"11日星期三","sunrise":"06:19","high":"高温 16.0℃","low":"低温 6.0℃","sunset":"17:42","aqi":17,"fx":"西风","fl":"<3级","type":"多云","notice":"绵绵的云朵，形状千变万化"},"forecast":[{"date":"12日星期四","sunrise":"06:20","high":"高温 13.0℃","low":"低温 6.0℃","sunset":"17:41","aqi":55,"fx":"无持续风向","fl":"<3级","type":"小雨","notice":"外出时请注意关好门窗，防止雨水飘入"},{"date":"13日星期五","sunrise":"06:21","high":"高温 18.0℃","low":"低温 7.0℃","sunset":"17:39","aqi":49,"fx":"南风","fl":"<3级","type":"晴","notice":"晴空万里，去沐浴阳光吧"},{"date":"14日星期六","sunrise":"06:22","high":"高温 13.0℃","low":"低温 9.0℃","sunset":"17:38","aqi":32,"fx":"北风","fl":"<3级","type":"阴","notice":"阴天是彩虹的前期之景"},{"date":"15日星期日","sunrise":"06:23","high":"高温 15.0℃","low":"低温 7.0℃","sunset":"17:36","aqi":31,"fx":"北风","fl":"<3级","type":"阴","notice":"阴天是彩虹的前期之景"},{"date":"16日星期一","sunrise":"06:24","high":"高温 16.0℃","low":"低温 6.0℃","sunset":"17:35","aqi":31,"fx":"西南风","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"}]}
     */

    private String date;
    private String message;
    private int status;
    private String city;
    private int count;
    private DataBean data;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * shidu : 48%
         * pm25 : 9.0
         * pm10 : 30.0
         * quality : 优
         * wendu : 9
         * ganmao : 各类人群可自由活动
         * yesterday : {"date":"11日星期三","sunrise":"06:19","high":"高温 16.0℃","low":"低温 6.0℃","sunset":"17:42","aqi":17,"fx":"西风","fl":"<3级","type":"多云","notice":"绵绵的云朵，形状千变万化"}
         * forecast : [{"date":"12日星期四","sunrise":"06:20","high":"高温 13.0℃","low":"低温 6.0℃","sunset":"17:41","aqi":55,"fx":"无持续风向","fl":"<3级","type":"小雨","notice":"外出时请注意关好门窗，防止雨水飘入"},{"date":"13日星期五","sunrise":"06:21","high":"高温 18.0℃","low":"低温 7.0℃","sunset":"17:39","aqi":49,"fx":"南风","fl":"<3级","type":"晴","notice":"晴空万里，去沐浴阳光吧"},{"date":"14日星期六","sunrise":"06:22","high":"高温 13.0℃","low":"低温 9.0℃","sunset":"17:38","aqi":32,"fx":"北风","fl":"<3级","type":"阴","notice":"阴天是彩虹的前期之景"},{"date":"15日星期日","sunrise":"06:23","high":"高温 15.0℃","low":"低温 7.0℃","sunset":"17:36","aqi":31,"fx":"北风","fl":"<3级","type":"阴","notice":"阴天是彩虹的前期之景"},{"date":"16日星期一","sunrise":"06:24","high":"高温 16.0℃","low":"低温 6.0℃","sunset":"17:35","aqi":31,"fx":"西南风","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"}]
         */

        private String shidu;
        private double pm25;
        private double pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public double getPm25() {
            return pm25;
        }

        public void setPm25(double pm25) {
            this.pm25 = pm25;
        }

        public double getPm10() {
            return pm10;
        }

        public void setPm10(double pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }



        public static class ForecastBean {
            /**
             * date : 12日星期四
             * sunrise : 06:20
             * high : 高温 13.0℃
             * low : 低温 6.0℃
             * sunset : 17:41
             * aqi : 55.0
             * fx : 无持续风向
             * fl : <3级
             * type : 小雨
             * notice : 外出时请注意关好门窗，防止雨水飘入
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }
    }
}
