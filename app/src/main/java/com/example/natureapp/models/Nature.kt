package com.example.natureapp.models

data class Nature(val nombre: String, val descripcion: String, val imagen: String){
    companion object{
        val nature = mutableListOf<Nature>(
            Nature("Antartida", "Prácticamente todo su terreno cubierto de nieve, increíbles glaciares azules, cuerpos de hielo que sorprenden con sus formas y reflejos de la luz y hasta volcanes activos.", "https://humanidades.com/wp-content/uploads/2017/02/antartida-2-e1561951998859.jpg"),
            Nature("Costa de Na Pali","Con su increíble color verde, imponentes cascadas y amplia flora y fauna, las aisladas playas de Na Pali son una excelente opción para todo aquel que busque aventuras pero también descanso en uno de los lugares más relajados del mundo.","https://assets.dm.rccl.com/is/image/RoyalCaribbeanCruises/royal/data/ports/napali-coast-hawaii/overview/napali-coast-hawaii-panoramic-view.jpg?\$750x320\$"),
            Nature("El Gran Cañón","El Gran Cañon, en los Estados Unidos, fue declarado Patrimonio de la Humanidad de la UNESCO en 1979","https://lasvegasentuidioma.com/wp-content/uploads/2018/09/Gran-Canon-Las-Vegas-en-tu-Idioma-e1674626393515.jpg"),
            Nature("Arboleda de bambú de Arashiyama","La Arboleda de bambú de Arashiyama, en Japón, es el paisaje justo para la foto perfecta.","https://www.lookoutpro.com/wp-content/uploads/2018/04/iStock-521310320.jpg"),
            Nature("La Gran Barrera de Coral","El mayor arrecife de coral del mundo está situado frente a la costa de Queensland, al nordeste de Australia.","https://cnnespanol.cnn.com/wp-content/uploads/2021/06/Gran-barrera-coral.jpeg?quality=100&strip=info")
        )
    }
}
