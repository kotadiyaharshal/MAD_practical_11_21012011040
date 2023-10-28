package com.example.mad_practical_11_21012011040

class PersionTable {
    companion object{
        val TABLE_NAME="PERSION"
        val COLOUMN_ID="ID"
        val COLOUMN_NAME="NAME"
        val COLOUMN_EMAIL="EMAIL"
        val COLOUMN_PHONE="PHONE"
        val COLOUMN_ADDRESS="ADDRESS"
        val COLOUMN_LAT="LAT"
        val COLOUMN_LONG="LONG"

       val CREATE_TABLE=("CREATE_TABLE"+ TABLE_NAME)+"("+ COLOUMN_ID +"TEXT PRIMARY KEY,"+ COLOUMN_NAME+"TEXT," + COLOUMN_EMAIL+"TEXT," + COLOUMN_PHONE+"TEXT,"+ COLOUMN_ADDRESS+"TEXT,"+ COLOUMN_LAT+"REAL,"+ COLOUMN_LONG+"REAL,"+")"

    }
}