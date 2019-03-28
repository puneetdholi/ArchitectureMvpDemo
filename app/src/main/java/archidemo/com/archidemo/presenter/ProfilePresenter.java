package archidemo.com.archidemo.presenter;

import archidemo.com.archidemo.model.Data;
import archidemo.com.archidemo.model.Profile;
import archidemo.com.archidemo.service.ProfileService;
import archidemo.com.archidemo.view.ProfileView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the country view interface.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class ProfilePresenter {

    private ProfileView profileView;
    private ProfileService profileService;

    public ProfilePresenter(ProfileView view) {
        this.profileView = view;

        if (this.profileService == null) {
            this.profileService = new ProfileService();
        }
    }

    public void getProfile() {
        profileService
                .getAPI()
                .getResults()
                .enqueue(new Callback<Profile>() {
                    @Override
                    public void onResponse(Call<Profile> call, Response<Profile> response) {
                        Data data = response.body().getData();

                        if (data != null ) {
                            profileView.getProfiles(data);
                        }
                    }

                    @Override
                    public void onFailure(Call<Profile> call, Throwable t) {
                        try {
                            throw new InterruptedException("Something went wrong!");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}
