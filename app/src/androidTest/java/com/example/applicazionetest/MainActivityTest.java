package com.example.applicazionetest;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity= mActivityTestRule.getActivity();

    }

    @Test
    public void TestLaunch(){
        View view = mActivity.findViewById(R.id.activity_main_title);
        assertNotNull(view);
    }
    @Test
    public void funAddTes() {
        assertEquals(10, 4+5);
    }
    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}