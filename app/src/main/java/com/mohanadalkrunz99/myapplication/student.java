package com.mohanadalkrunz99.myapplication;


    public class student {
        String id;
        String level;
        String avg;
        String name;

        public student(String id, String level, String avg, String name) {
            this.id = id;
            this.level = level;
            this.avg = avg;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getAvg() {
            return avg;
        }

        public void setAvg(String avg) {
            this.avg = avg;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


