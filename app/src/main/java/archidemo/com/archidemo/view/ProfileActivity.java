package archidemo.com.archidemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.archidemo.R;
import com.squareup.picasso.Picasso;

import archidemo.com.archidemo.utils.PicassoCircleTransformation;
import butterknife.BindView;
import butterknife.ButterKnife;
import archidemo.com.archidemo.model.Data;
import archidemo.com.archidemo.presenter.ProfilePresenter;


public class ProfileActivity extends AppCompatActivity implements ProfileView, View.OnClickListener {

    @BindView(R.id.txtName)
    TextView txtName;
    @BindView(R.id.txtDesignation)
    TextView txtDesignation;
    @BindView(R.id.txtLocation)
    TextView txtLocation;
    @BindView(R.id.txtQualification)
    TextView txtQualification;
    @BindView(R.id.txtWorkExp)
    TextView txtWorkExp;
    @BindView(R.id.txtExpectedCtc)
    TextView txtExpectedCtc;
    @BindView(R.id.txtCurrentlyWorking)
    TextView txtCurrentlyWorking;
    @BindView(R.id.txtDesignationDetail)
    TextView txtDesignationDetail;

    @BindView(R.id.txtSkillSet)
    TextView txtSkillSet;

    @BindView(R.id.txtWorkFunction)
    TextView txtWorkFunction;

    @BindView(R.id.txtIndustry)
    TextView txtIndustry;

    @BindView(R.id.btnConfirm)
    TextView btnConfirm;

    @BindView(R.id.txtEditProfile)
    TextView txtEditProfile;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        init();

        ProfilePresenter profilePresenter = new ProfilePresenter(this);

        // Maybe it's best to call it on onResume()
        profilePresenter.getProfile();
    }

    public void init(){
        txtSkillSet.setOnClickListener(this);
        txtWorkFunction.setOnClickListener(this);
        txtIndustry.setOnClickListener(this);
        txtEditProfile.setOnClickListener(this);
        btnConfirm.setOnClickListener(this);
    }

    @Override
    public void getProfiles(Data profiles) {

        // See your Logcat :)
        txtName.setText(profiles.getName());
        txtLocation.setText(profiles.getLocation());
       // txtDesignation.setText(profiles.getDesignation().toString());
       // txtDesignationDetail.setText(profiles.getDesignation().toString());
       // txtCurrentlyWorking.setText(profiles.getLastCompany().toString());

        //txtQualification.setText(profiles.getHighestQualification().toString());
        txtExpectedCtc.setText(profiles.getExpectedCtc());
        txtWorkExp.setText(profiles.getExperience());



        Picasso.with(getApplicationContext()).load(profiles.getImage())
                .placeholder(R.mipmap.app_icon)
                .error(R.mipmap.app_icon)
                .transform(new PicassoCircleTransformation())
                .into((ImageView) findViewById(R.id.profile_image));

    }



    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.txtSkillSet:
                txtSkillSet.setTextColor(getResources().getColor(R.color.green));
                txtWorkFunction.setTextColor(getResources().getColor(R.color.colorGrey));
                txtIndustry.setTextColor(getResources().getColor(R.color.colorGrey));
                Toast.makeText(this, "Skill Set Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.txtWorkFunction:
                txtSkillSet.setTextColor(getResources().getColor(R.color.colorGrey));
                txtWorkFunction.setTextColor(getResources().getColor(R.color.green));
                txtIndustry.setTextColor(getResources().getColor(R.color.colorGrey));
                Toast.makeText(this, "Work Function Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.txtIndustry:
                txtSkillSet.setTextColor(getResources().getColor(R.color.colorGrey));
                txtWorkFunction.setTextColor(getResources().getColor(R.color.colorGrey));
                txtIndustry.setTextColor(getResources().getColor(R.color.green));
                Toast.makeText(this, "Industry Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnConfirm:
                Toast.makeText(this, "Confirm Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.txtEditProfile:
                Toast.makeText(this, "Edit Profile Clicked", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
