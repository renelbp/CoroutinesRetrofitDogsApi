package com.example.coroutinesretrofit

import com.google.gson.annotations.SerializedName

data class DogsResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
/** @SerializedName sirve para usar un nombre de variable diferente al que la api requiere para atender la llamada
 * ya que en ocasiones queremos darle un nombre para identificar mejor el recurso que estamos consumiendo de la API pero
 * la api requiere exactamente el nombre con el cual el recurso esta guardado para poder proporcionarlo**/
)



