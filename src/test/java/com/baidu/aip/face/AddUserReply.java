package com.baidu.aip.face;

public class AddUserReply {


    /**
     * result : {"face_token":"c9d2bfcccaebdc41693826361d530d40","location":{"top":19.95,"left":25.13,"rotation":0,"width":45,"height":49}}
     * log_id : 2579996545651
     * error_msg : SUCCESS
     * cached : 0
     * error_code : 0
     * timestamp : 1578643572
     */

    private ResultBean result;
    private long log_id;
    private String error_msg;
    private int cached;
    private int error_code;
    private int timestamp;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public int getCached() {
        return cached;
    }

    public void setCached(int cached) {
        this.cached = cached;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public static class ResultBean {
        /**
         * face_token : c9d2bfcccaebdc41693826361d530d40
         * location : {"top":19.95,"left":25.13,"rotation":0,"width":45,"height":49}
         */

        private String face_token;
        private LocationBean location;

        public String getFace_token() {
            return face_token;
        }

        public void setFace_token(String face_token) {
            this.face_token = face_token;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public static class LocationBean {
            /**
             * top : 19.95
             * left : 25.13
             * rotation : 0
             * width : 45
             * height : 49
             */

            private double top;
            private double left;
            private int rotation;
            private int width;
            private int height;

            public double getTop() {
                return top;
            }

            public void setTop(double top) {
                this.top = top;
            }

            public double getLeft() {
                return left;
            }

            public void setLeft(double left) {
                this.left = left;
            }

            public int getRotation() {
                return rotation;
            }

            public void setRotation(int rotation) {
                this.rotation = rotation;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }
        }
    }
}
