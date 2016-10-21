package com.betterup.sample.sample;

import android.os.Bundle;

import ir.sirlate.library.ToasterActivity;

public class SampleActivity extends ToasterActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sample);
  }
}
