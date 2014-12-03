package bc0nt13.findme.resource


import bc0nt13.findme.Room
import retrofit.http.GET
import rx.Observable

public trait RoomApi {
    GET("/rooms")
    public fun list(): Observable<List<Room>>
}
