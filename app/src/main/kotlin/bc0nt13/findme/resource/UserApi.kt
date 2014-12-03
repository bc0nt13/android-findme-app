package bc0nt13.findme.resource


import bc0nt13.findme.Room
import retrofit.http.POST
import rx.Observable

public trait UserApi {
    POST("/users")
    public fun signup(): Observable<List<Room>>
}
