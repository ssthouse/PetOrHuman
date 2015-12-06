package com.ssthouse.petorhuman.rtrofit;

import java.util.List;

/**
 * Created by ssthouse on 2015/12/5.
 */
public class Bean {
    private DataEntity data;
    /**
     * data : {"record_list":[{"record_id":75635,"user_id":31686,"song_ranking":1,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"鲍檬歌","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/1435071430_31686_46369_1","uid_from_yiban":5018723,"real_name":"鲍檬歌","college_id":13002,"college":"华中科技大学","song_name":"学不会","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/75635.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/75635.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/513_1384922924823.mp3","is_original":0,"is_participate":0,"song_description":"","is_delete":1,"popularity":1352,"comment_count":40,"like_count":16,"play_count":1703,"forward_count":34},{"record_id":53525,"user_id":11909,"song_ranking":2,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"谭若冰","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/11909.jpg","uid_from_yiban":null,"real_name":"","college_id":13008,"college":"华中师范大学","song_name":"世界唯一的你","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/7.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/7.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/11909_1351411034798.mp3","is_original":0,"is_participate":0,"song_description":"","is_delete":0,"popularity":1658,"comment_count":45,"like_count":34,"play_count":1529,"forward_count":32},{"record_id":80302,"user_id":29064,"song_ranking":3,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"Jolee_Lee","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/1412145740814_9746","uid_from_yiban":null,"real_name":"Jolee Lee","college_id":1002,"college":"北京大学","song_name":"AINY","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/15.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/15.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/29064_1403414040155.mp3","is_original":0,"is_participate":0,"song_description":"一直想翻唱GEM这首[太开心]~后面对着渣话筒的尖叫请忽略[拜拜][拜拜][拜拜]","is_delete":0,"popularity":838,"comment_count":37,"like_count":27,"play_count":142,"forward_count":11},{"record_id":76046,"user_id":451,"song_ranking":4,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"邱良","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/1427951703803_9562_cut","uid_from_yiban":null,"real_name":"邱良","college_id":13002,"college":"华中科技大学","song_name":"蓝莲花 (钢琴版)","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/100.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/100.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/451_1386166513715.mp3","is_original":0,"is_participate":0,"song_description":"","is_delete":0,"popularity":1492,"comment_count":7,"like_count":23,"play_count":1701,"forward_count":9},{"record_id":78804,"user_id":17282,"song_ranking":5,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"HIGH-B","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/1420593194613_1933_cut","uid_from_yiban":null,"real_name":"OJJ","college_id":18001,"college":"华南理工大学","song_name":"saving all my love for youuuu","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/21.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/21.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/17282_1396777219317.mp3","is_original":0,"is_participate":0,"song_description":"","is_delete":0,"popularity":769,"comment_count":22,"like_count":14,"play_count":382,"forward_count":0},{"record_id":46219,"user_id":8981,"song_ranking":6,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"Z.Z.L","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/1410065099239_5939","uid_from_yiban":null,"real_name":"","college_id":1032,"college":"北京外国语大学","song_name":"Melody","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/81_2.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/81_2.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/8981_1340713713037.mp3","is_original":0,"is_participate":0,"song_description":"","is_delete":1,"popularity":638,"comment_count":16,"like_count":11,"play_count":279,"forward_count":1},{"record_id":81272,"user_id":31325,"song_ranking":7,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"Aubrey丶李靖暄","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/1412250547293_7704","uid_from_yiban":null,"real_name":"ljx","college_id":1004,"college":"北京航空航天大学","song_name":" 每个人都会","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/80.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/80.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/31325_1408759400573.mp3","is_original":0,"is_participate":0,"song_description":"","is_delete":0,"popularity":388,"comment_count":4,"like_count":11,"play_count":45,"forward_count":1},{"record_id":53567,"user_id":11935,"song_ranking":8,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"韩林康","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/male100.jpg","uid_from_yiban":null,"real_name":"","college_id":13008,"college":"华中师范大学","song_name":"浮夸(陈奕迅)","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/580_2.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/580_2.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/11935_1351421959990.mp3","is_original":0,"is_participate":0,"song_description":"","is_delete":0,"popularity":788,"comment_count":23,"like_count":11,"play_count":515,"forward_count":0},{"record_id":71412,"user_id":24941,"song_ranking":9,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"暖了个暖","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/24941.jpg","uid_from_yiban":null,"real_name":"","college_id":13019,"college":"湖北大学","song_name":"stay(rihanna)","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/71412.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/71412.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/24941_1375801999599.mp3","is_original":0,"is_participate":0,"song_description":"","is_delete":0,"popularity":646,"comment_count":15,"like_count":9,"play_count":347,"forward_count":0},{"record_id":81259,"user_id":26174,"song_ranking":10,"province_id":0,"hotlist_id":1,"stime":"2014-08-22 14:52:04","is_like":0,"province":"","nick_name":"Elaine_wyr","image_path":"http://7nj2i2.com2.z0.glb.qiniucdn.com/1430407154601_2395_cut","uid_from_yiban":null,"real_name":"吴莹蕊","college_id":13001,"college":"武汉大学","song_name":"没关系，是爱情啊","song_pic_path_original":"http://7nj2i1.com2.z0.glb.qiniucdn.com/81259.jpg","song_pic_path":"http://7nj2i1.com2.z0.glb.qiniucdn.com/81259.jpg?imageView2/2/w/200/h/200","song_path":"http://7nj2i0.com2.z0.glb.qiniucdn.com/26174_1408708122108.mp3","is_original":0,"is_participate":0,"song_description":"暑期唯一真正看的一部剧《没关系，是爱情啊》的同名主题曲，看了这周的两集觉得冲绳好美啊~~不知不觉这竟然已经是我生学的第7首韩语歌了[偷笑]","is_delete":0,"popularity":595,"comment_count":10,"like_count":14,"play_count":158,"forward_count":1}]}
     * msg : ok
     * code : 0
     * msg_show : 0
     */

    private String msg;
    private int code;
    private int msg_show;

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg_show(int msg_show) {
        this.msg_show = msg_show;
    }

    public DataEntity getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public int getMsg_show() {
        return msg_show;
    }

    public static class DataEntity {
        /**
         * record_id : 75635
         * user_id : 31686
         * song_ranking : 1
         * province_id : 0
         * hotlist_id : 1
         * stime : 2014-08-22 14:52:04
         * is_like : 0
         * province :
         * nick_name : 鲍檬歌
         * image_path : http://7nj2i2.com2.z0.glb.qiniucdn.com/1435071430_31686_46369_1
         * uid_from_yiban : 5018723
         * real_name : 鲍檬歌
         * college_id : 13002
         * college : 华中科技大学
         * song_name : 学不会
         * song_pic_path_original : http://7nj2i1.com2.z0.glb.qiniucdn.com/75635.jpg
         * song_pic_path : http://7nj2i1.com2.z0.glb.qiniucdn.com/75635.jpg?imageView2/2/w/200/h/200
         * song_path : http://7nj2i0.com2.z0.glb.qiniucdn.com/513_1384922924823.mp3
         * is_original : 0
         * is_participate : 0
         * song_description :
         * is_delete : 1
         * popularity : 1352
         * comment_count : 40
         * like_count : 16
         * play_count : 1703
         * forward_count : 34
         */

        private List<RecordListEntity> record_list;

        public void setRecord_list(List<RecordListEntity> record_list) {
            this.record_list = record_list;
        }

        public List<RecordListEntity> getRecord_list() {
            return record_list;
        }

        public static class RecordListEntity {
            private int record_id;
            private int user_id;
            private int song_ranking;
            private int province_id;
            private int hotlist_id;
            private String stime;
            private int is_like;
            private String province;
            private String nick_name;
            private String image_path;
            private int uid_from_yiban;
            private String real_name;
            private int college_id;
            private String college;
            private String song_name;
            private String song_pic_path_original;
            private String song_pic_path;
            private String song_path;
            private int is_original;
            private int is_participate;
            private String song_description;
            private int is_delete;
            private int popularity;
            private int comment_count;
            private int like_count;
            private int play_count;
            private int forward_count;

            public void setRecord_id(int record_id) {
                this.record_id = record_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public void setSong_ranking(int song_ranking) {
                this.song_ranking = song_ranking;
            }

            public void setProvince_id(int province_id) {
                this.province_id = province_id;
            }

            public void setHotlist_id(int hotlist_id) {
                this.hotlist_id = hotlist_id;
            }

            public void setStime(String stime) {
                this.stime = stime;
            }

            public void setIs_like(int is_like) {
                this.is_like = is_like;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public void setNick_name(String nick_name) {
                this.nick_name = nick_name;
            }

            public void setImage_path(String image_path) {
                this.image_path = image_path;
            }

            public void setUid_from_yiban(int uid_from_yiban) {
                this.uid_from_yiban = uid_from_yiban;
            }

            public void setReal_name(String real_name) {
                this.real_name = real_name;
            }

            public void setCollege_id(int college_id) {
                this.college_id = college_id;
            }

            public void setCollege(String college) {
                this.college = college;
            }

            public void setSong_name(String song_name) {
                this.song_name = song_name;
            }

            public void setSong_pic_path_original(String song_pic_path_original) {
                this.song_pic_path_original = song_pic_path_original;
            }

            public void setSong_pic_path(String song_pic_path) {
                this.song_pic_path = song_pic_path;
            }

            public void setSong_path(String song_path) {
                this.song_path = song_path;
            }

            public void setIs_original(int is_original) {
                this.is_original = is_original;
            }

            public void setIs_participate(int is_participate) {
                this.is_participate = is_participate;
            }

            public void setSong_description(String song_description) {
                this.song_description = song_description;
            }

            public void setIs_delete(int is_delete) {
                this.is_delete = is_delete;
            }

            public void setPopularity(int popularity) {
                this.popularity = popularity;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public void setForward_count(int forward_count) {
                this.forward_count = forward_count;
            }

            public int getRecord_id() {
                return record_id;
            }

            public int getUser_id() {
                return user_id;
            }

            public int getSong_ranking() {
                return song_ranking;
            }

            public int getProvince_id() {
                return province_id;
            }

            public int getHotlist_id() {
                return hotlist_id;
            }

            public String getStime() {
                return stime;
            }

            public int getIs_like() {
                return is_like;
            }

            public String getProvince() {
                return province;
            }

            public String getNick_name() {
                return nick_name;
            }

            public String getImage_path() {
                return image_path;
            }

            public int getUid_from_yiban() {
                return uid_from_yiban;
            }

            public String getReal_name() {
                return real_name;
            }

            public int getCollege_id() {
                return college_id;
            }

            public String getCollege() {
                return college;
            }

            public String getSong_name() {
                return song_name;
            }

            public String getSong_pic_path_original() {
                return song_pic_path_original;
            }

            public String getSong_pic_path() {
                return song_pic_path;
            }

            public String getSong_path() {
                return song_path;
            }

            public int getIs_original() {
                return is_original;
            }

            public int getIs_participate() {
                return is_participate;
            }

            public String getSong_description() {
                return song_description;
            }

            public int getIs_delete() {
                return is_delete;
            }

            public int getPopularity() {
                return popularity;
            }

            public int getComment_count() {
                return comment_count;
            }

            public int getLike_count() {
                return like_count;
            }

            public int getPlay_count() {
                return play_count;
            }

            public int getForward_count() {
                return forward_count;
            }
        }
    }
}
