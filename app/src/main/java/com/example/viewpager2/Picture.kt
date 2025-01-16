package com.example.viewpager2


import java.io.Serializable

class Picture (
    val name:String,
    val author:String,
    val imageView: Int
):Serializable{
    companion object{
        val viewPageList = mutableListOf(
            Picture(
                "Портрет Уны. 1934. ЧС","Казимир Малевич",(R.drawable.portraituna)
            ),
            Picture(
                "Девушка с красным древком Уны. 1934. ЧС","Казимир Малевич",(R.drawable.girlredrevkom)
            ),
            Picture(
                "Портрет госпожи Лизы дель Джокондо","Леонардо да Винчи",(R.drawable.monaliza)
            ),
            Picture(
                "Мадонна в скалах","Леонардо да Винчи",(R.drawable.madonavscalax)
            ),
            Picture(
                "Иоанн Креститель","Леонардо да Винчи",(R.drawable.ioan)
            ),
            Picture(
                "Святая Анна с Мадонной и младенцем","Леонардо да Винчи",(R.drawable.svitayanna)
            ),
            Picture(
                "Старый гитарист","Пабло Пикассо",(R.drawable.gitarist)
            ),
            Picture(
                "Дон-Кихот","Пабло Пикассо",(R.drawable.donkixot)
            ),
            Picture(
                "Голубка Пикассо","Пабло Пикассо",(R.drawable.golybka)
            ),
            Picture(
                "Девушка перед зеркалом","Пабло Пикассо",(R.drawable.zerkalo)
            ),
        )
    }
}