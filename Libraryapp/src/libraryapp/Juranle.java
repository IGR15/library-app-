/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;


import java.util.Date;

public class Juranle extends Book{
        private int ConferenceNo;
        private String ConferenceName;

        public Juranle(String title, BookAuthor author, String genre, int version, Date date) {
            super(title, author, genre, version, date);
        }




        public Juranle(int ConferenceNo, String ConferenceName, String title, BookAuthor author, String genre, int version, Date date) {
            super(title, author, genre, version, date);
            this.ConferenceNo = ConferenceNo;
            this.ConferenceName = ConferenceName;
        }



        public int getConferenceNo() {
            return ConferenceNo;
        }

        public void setConferenceNo(int ConferenceNo) {
            this.ConferenceNo = ConferenceNo;
        }

        public String getConferenceName() {
            return ConferenceName;
        }

        public void setConferenceName(String ConferenceName) {
            this.ConferenceName = ConferenceName;
        }

        @Override
        public String toString() {
            return "Journal{" + "ConferenceNo=" + ConferenceNo + ", ConferenceName=" + ConferenceName + '}';
        }



    }

