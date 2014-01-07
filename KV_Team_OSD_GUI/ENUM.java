enum Settings {
  S_CHECK_,		// used for check
  S_RSSIMIN,
  S_RSSIMAX,
  S_RSSI_ALARM,
  S_MWRSSI,
  S_PWMRSSI,
  S_PWMRSSIDIVIDER,
  S_VOLTAGEMIN,
  S_BATCELLS,
  S_DIVIDERRATIO,
  S_MAINVOLTAGE_VBAT,
  S_VIDDIVIDERRATIO,
  S_VIDVOLTAGE_VBAT,
  S_TEMPERATUREMAX,
  S_BOARDTYPE,
  S_DISPLAYGPS,
  S_COORDINATES,
  S_HEADING360,
  S_UNITSYSTEM,
  S_VIDEOSIGNALTYPE,
  S_RESETSTATISTICS,
  S_ENABLEADC,
  S_USE_BOXNAMES,
  S_BLINKINGHZ,    // selectable alarm blink freq
  S_MWAMPERAGE,
  S_CURRSENSSENSITIVITY,
  S_CURRSENSOFFSET_H,
  S_CURRSENSOFFSET_L,
  S_CLIMB_RATE_ALARM,
  S_VOLUME,
  
  S_CS0,
  S_CS1,
  S_CS2,
  S_CS3,
  S_CS4,
  S_CS5,
  S_CS6,
  S_CS7,
  S_CS8,
  S_CS9,
  // EEPROM_SETTINGS must be last!
  EEPROM_SETTINGS,
  
  // Screen item Locations
// ********* EEProm enum data position and display On/Off option for all items on screen ****************
// Enum valid for both PAL/NTSC  
  L_GPS_NUMSATPOSITIONROW,    //34
  L_GPS_NUMSATPOSITIONCOL,
  L_GPS_NUMSATPOSITIONDSPL,
  L_GPS_DIRECTIONTOHOMEPOSROW,
  L_GPS_DIRECTIONTOHOMEPOSCOL,
  L_GPS_DIRECTIONTOHOMEPOSDSPL,
  L_GPS_DISTANCETOHOMEPOSROW,
  L_GPS_DISTANCETOHOMEPOSCOL,
  L_GPS_DISTANCETOHOMEPOSDSPL,
  L_SPEEDPOSITIONROW,
  L_SPEEDPOSITIONCOL,
  L_SPEEDPOSITIONDSPL,
  L_GPS_ANGLETOHOMEPOSROW,
  L_GPS_ANGLETOHOMEPOSCOL,
  L_GPS_ANGLETOHOMEPOSDSPL,
  L_MW_GPS_ALTPOSITIONROW,
  L_MW_GPS_ALTPOSITIONCOL,
  L_MW_GPS_ALTPOSITIONDSPL,
  L_SENSORPOSITIONROW,
  L_SENSORPOSITIONCOL,
  L_SENSORPOSITIONDSPL,
  L_MW_HEADINGPOSITIONROW,
  L_MW_HEADINGPOSITIONCOL,
  L_MW_HEADINGPOSITIONDSPL,
  L_MW_HEADINGGRAPHPOSROW,
  L_MW_HEADINGGRAPHPOSCOL,
  L_MW_HEADINGGRAPHPOSDSPL,
  L_TEMPERATUREPOSROW,
  L_TEMPERATUREPOSCOL,
  L_TEMPERATUREPOSDSPL,

  L_MW_ALTITUDEPOSITIONROW,
  L_MW_ALTITUDEPOSITIONCOL,
  L_MW_ALTITUDEPOSITIONDSPL,
  L_CLIMBRATEPOSITIONROW,
  L_CLIMBRATEPOSITIONCOL,
  L_CLIMBRATEPOSITIONDSPL,
  L_HORIZONPOSITIONROW,
  L_HORIZONPOSITIONCOL,
  L_HORIZONPOSITIONDSPL,
  L_HORIZONSIDEREFROW,
  L_HORIZONSIDEREFCOL,
  L_HORIZONSIDEREFDSPL,
  L_HORIZONCENTERREFROW,
  L_HORIZONCENTERREFCOL,
  L_HORIZONCENTERREFDSPL,  
    
  L_CURRENTTHROTTLEPOSITIONROW,
  L_CURRENTTHROTTLEPOSITIONCOL,
  L_CURRENTTHROTTLEPOSITIONDSPL,
  L_FLYTIMEPOSITIONROW,
  L_FLYTIMEPOSITIONCOL,
  L_FLYTIMEPOSITIONDSPL,
  L_ONTIMEPOSITIONROW,
  L_ONTIMEPOSITIONCOL,
  L_ONTIMEPOSITIONDSPL,
  L_MOTORARMEDPOSITIONROW,
  L_MOTORARMEDPOSITIONCOL,
  L_MOTORARMEDPOSITIONDSPL,
  L_MW_GPS_LATPOSITIONROW,
  L_MW_GPS_LATPOSITIONCOL,
  L_MW_GPS_LATPOSITIONDSPL,
  L_MW_GPS_LONPOSITIONROW,
  L_MW_GPS_LONPOSITIONCOL,
  L_MW_GPS_LONPOSITIONDSPL,
  L_RSSIPOSITIONROW,
  L_RSSIPOSITIONCOL,
  L_RSSIPOSITIONDSPL,
  L_VOLTAGEPOSITIONROW,
  L_VOLTAGEPOSITIONCOL,
  L_VOLTAGEPOSITIONDSPL,  
  L_MAINBATLEVEVOLUTIONROW,
  L_MAINBATLEVEVOLUTIONCOL,
  L_MAINBATLEVEVOLUTIONDSPL,  
  L_VIDVOLTAGEPOSITIONROW,
  L_VIDVOLTAGEPOSITIONCOL,
  L_VIDVOLTAGEPOSITIONDSPL,
  L_AMPERAGEPOSITIONROW,
  L_AMPERAGEPOSITIONCOL,
  L_AMPERAGEPOSITIONDSPL,
  L_PMETERSUMPOSITIONROW,
  L_PMETERSUMPOSITIONCOL,
  L_PMETERSUMPOSITIONDSPL,
  L_CALLSIGNPOSITIONROW,
  L_CALLSIGNPOSITIONCOL,
  L_CALLSIGNPOSITIONDSPL,
  
  // EEPROM_ITEM_LOCATION must be last for Items location!
  EEPROM_ITEM_LOCATION
};





