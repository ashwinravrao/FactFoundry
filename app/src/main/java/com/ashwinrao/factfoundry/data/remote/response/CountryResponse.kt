package com.ashwinrao.factfoundry.data.remote.response


import com.google.gson.annotations.SerializedName

data class CountryResponse(
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
    @SerializedName("cioc")
    val cioc: String, // ARG
    @SerializedName("currencies")
    val currencies: List<Currency>,
    @SerializedName("demonym")
    val demonym: String, // Argentinean
    @SerializedName("flag")
    val flag: String, // https://restcountries.eu/data/arg.svg
    @SerializedName("gini")
    val gini: Double, // 44.5
    @SerializedName("languages")
    val languages: List<Language>,
    @SerializedName("latlng")
    val latlng: List<Double>,
    @SerializedName("name")
    val name: String, // Argentina
    @SerializedName("nativeName")
    val nativeName: String, // Argentina
    @SerializedName("numericCode")
    val numericCode: String, // 032
    @SerializedName("population")
    val population: Int, // 43590400
    @SerializedName("region")
    val region: String, // Americas
    @SerializedName("regionalBlocs")
    val regionalBlocs: List<RegionalBloc>,
    @SerializedName("subregion")
    val subregion: String, // South America
    @SerializedName("timezones")
    val timezones: List<String>,
    @SerializedName("topLevelDomain")
    val topLevelDomain: List<String>,
    @SerializedName("translations")
    val translations: Translations
) {
    data class Currency(
        @SerializedName("code")
        val code: String, // ARS
        @SerializedName("name")
        val name: String, // Argentine peso
        @SerializedName("symbol")
        val symbol: String // $
    )

    data class Language(
        @SerializedName("iso639_1")
        val iso6391: String, // gn
        @SerializedName("iso639_2")
        val iso6392: String, // grn
        @SerializedName("name")
        val name: String, // Guaraní
        @SerializedName("nativeName")
        val nativeName: String // Avañe'ẽ
    )

    data class RegionalBloc(
        @SerializedName("acronym")
        val acronym: String, // USAN
        @SerializedName("name")
        val name: String, // Union of South American Nations
        @SerializedName("otherAcronyms")
        val otherAcronyms: List<String>,
        @SerializedName("otherNames")
        val otherNames: List<String>
    )

    data class Translations(
        @SerializedName("br")
        val br: String, // Argentina
        @SerializedName("de")
        val de: String, // Argentinien
        @SerializedName("es")
        val es: String, // Argentina
        @SerializedName("fa")
        val fa: String, // آرژانتین
        @SerializedName("fr")
        val fr: String, // Argentine
        @SerializedName("hr")
        val hr: String, // Argentina
        @SerializedName("it")
        val it: String, // Argentina
        @SerializedName("ja")
        val ja: String, // アルゼンチン
        @SerializedName("nl")
        val nl: String, // Argentinië
        @SerializedName("pt")
        val pt: String // Argentina
    )
}