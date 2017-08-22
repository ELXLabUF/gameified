package tamu.gameified;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by colin on 6/3/2016.
 */
public class ChapterCollectionFragAdapter extends FragmentStatePagerAdapter {

    public ChapterCollectionFragAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return ChapterDataSingleton.getSync(ChapterCollection.missionBoardContext).totalNumberOfRecordings();
        // return ChapterDataSingleton.getSync(ChapterCollection.missionBoardContext).getByUnit(ChapterCollection.unitSelected).size();
    } //need to return the number of total missions here

    @Override
    public Fragment getItem(int i) {
        switch(i) {
            //place if conditions in default for arrows with first and last?
            default: return ChapterCollectionFragment.newInstance("" + i,"");
        }
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {}


}
