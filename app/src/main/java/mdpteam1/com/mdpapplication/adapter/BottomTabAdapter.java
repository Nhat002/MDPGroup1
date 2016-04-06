
package mdpteam1.com.mdpapplication.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import mdpteam1.com.mdpapplication.fragment.BluetoothFragment;
import mdpteam1.com.mdpapplication.fragment.ConfigurationFragment;
import mdpteam1.com.mdpapplication.fragment.ControlFragment;
import mdpteam1.com.mdpapplication.fragment.KeyStartFragment;
import mdpteam1.com.mdpapplication.fragment.MDFStringFragment;

/**
 * Created by Nhat Tran on 13/2/2016.
 */
public class BottomTabAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 5;
    private Context context;
    public BottomTabAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new ControlFragment();
            case 1:
                return new KeyStartFragment();
            case 2:
                return new BluetoothFragment();
            case 3:
                return new ConfigurationFragment();
            case 4:
                return new MDFStringFragment();
            default:
                return new ControlFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    /*@Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch(position){
            case 0:
                return new ControlFragment().TAG;
            case 1:
                return new KeyStartFragment().TAG;
            case 2:
                return new BluetoothFragment().TAG;
            case 3:
                return new ConfigurationFragment().TAG;
            default:
                return new ControlFragment().TAG;
        }
    }*/
}
