package com.ashwinrao.factfoundry.data.remote.response


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("alpha2Code")
    val alpha2Code: String, // AR
    @SerializedName("alpha3Code")
    val alpha3Code: String, // ARG
    @SerializedName("altSpellings")
    val altSpellings: List<String>,
    @SerializedName("area")
    val area: Double, // 2780400.0
    @SerializedName("borders")
    val borders: List<String>,
    @SerializedName("callingCodes")
    val callingCodes: List<String>,
    @SerializedName("capital")
    val capital: String, // Buenos Aires
    @SerializedName("currencies")
    val currencies: List<String>,
    @SerializedName("demonym")
    val demonym: String, // Argentinean
    @SerializedName("gini")
    val gini: Double, // 44.5
    @SerializedName("languages")
    val languages: List<String>,
    @SerializedName("latlng")
    val latLng: List<Double>,
    @SerializedName("name")
    val name: String, // Argentina
    @SerializedName("nativeName")
    val nativeName: String, // Argentina
    @SerializedName("numericCode")
    val numericCode: String, // 032
    @SerializedName("population")
    val population: Int, // 43131966
    @SerializedName("region")
    val region: String, // Americas
    @SerializedName("relevance")
    val relevance: String, // 0
    @SerializedName("subregion")
    val subregion: String, // South America
    @SerializedName("timezones")
    val timezones: List<String>,
    @SerializedName("topLevelDomain")
    val topLevelDomain: List<String>,
    @SerializedName("translations")
    val translations: Translations
) {
    data class Translations(
        @SerializedName("de")
        val de: String, // Argentinien
        @SerializedName("es")
        val es: String, // Argentina
        @SerializedName("fr")
        val fr: String, // Argentine
        @SerializedName("it")
        val it: String, // Argentina
        @SerializedName("ja")
        val ja: String // アルゼンチン
    )
}