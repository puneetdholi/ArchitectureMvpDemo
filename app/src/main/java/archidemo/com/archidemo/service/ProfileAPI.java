package archidemo.com.archidemo.service;


import archidemo.com.archidemo.model.Profile;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * This class represents the Countries API, all endpoints can stay here.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 09/03/18.
 * Jesus loves you.
 */
public interface ProfileAPI {

    @Headers("Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImQzNDI1N2I5OTAxYmEwYThlODRhYTI5NjA2ZDMxNjBkOTRkYTk3ZWM3ZDdmZjcwNjQwZjM0ZThiZDM1NWY0YmM1ODQxNWRmYTUxOGFlMTliIn0.eyJhdWQiOiIzIiwianRpIjoiZDM0MjU3Yjk5MDFiYTBhOGU4NGFhMjk2MDZkMzE2MGQ5NGRhOTdlYzdkN2ZmNzA2NDBmMzRlOGJkMzU1ZjRiYzU4NDE1ZGZhNTE4YWUxOWIiLCJpYXQiOjE1NTI3MjgxNTUsIm5iZiI6MTU1MjcyODE1NSwiZXhwIjoxNTg0MzUwNTU1LCJzdWIiOiIyMTk0Iiwic2NvcGVzIjpbXX0.2xmzLjuf02XnpgbB8yM5h_YExOa-LCIZJ5OMD1j7B8DCfsXKfPhKffLJJsnneU5GALODGdjkwg8sQMXINtsDg6kaaOujXnIPEVG8sKK2ZBqvZlMMqVrknyadyIjGA7fQ5q3q51gvqXm4VkKJVkDdkXKeR52fN7KU2jEy6W_yZnCVlE_2A0yY-um48TKjuPCcVbT3SXowEvuSoAIY_Re3AGYtKDcuQ_LWu_6rp7ZWr3oupCjTZDZzihsebz0zTuYX2WdkAgK4IrWM0mv8x5veXLbKkvenSep_hmHfmQpU4ttKcJei_K_MUT7o0oBOxVI2MEpGflV2KiuQiGgi42Pqjr3DazUZ0HGOQtvmESsiY4-lolXcqnT9foP4j5tGbSJktIUXK2pgmhKLIFIZqnNUSbLKjh6aAVv3tVe8Jpc25wjrYGFyEyqw98cWfVm1fojhO-qelpt5JQ11CSefCItaSRZrXWe0q195Mz6QnzMzQvjxPmpDQgiiVI_2nICZpcC6vWSaJH1K-TzyJF-J12RBPEGG_GV7opdhpk8AzFb0pUo9QPpcW3WZEbTLFkXYYLqHSPR0zTxomozcPGpUYWdKH-E7oGBaWNsZjrtKU22yjk34yzrrrX1YkdBhannHeWglpJuoXYu6hA09PWpQ4m8Wz3MKEg2M0AdAQNkibJLDRQA")
    @GET("1.0/profiles/74")
    Call<Profile> getResults();


}
