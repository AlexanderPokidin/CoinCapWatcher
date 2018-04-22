package com.pokidin.a.coincapwatcher.api

import com.pokidin.a.coincapwatcher.models.CoinCap
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ServerApi {
    @GET("ticker")
fun loadData(@Query("limit") limit:Int=100):Deferred<List<CoinCap>>
}