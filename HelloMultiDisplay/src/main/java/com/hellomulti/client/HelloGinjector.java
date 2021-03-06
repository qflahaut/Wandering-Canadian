package com.hellomulti.client;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.hellomulti.client.ui.MainView;


@GinModules({HelloGinModule.class})
public interface HelloGinjector extends Ginjector {

  PlaceHistoryHandler getPlaceHistoryHandler();  
  MainView getMainView();
  
}
