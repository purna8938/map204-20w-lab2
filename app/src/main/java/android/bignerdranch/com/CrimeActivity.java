package android.bignerdranch.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;



public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}