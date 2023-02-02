package com.example.deveducatecore.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClipType {
    CAROB_CLIP_GUN("Carob clip gun"),
    CAROB_CLIP_RIFLE("Carob clip rifle"),
    CAROB_CLIP_SNIPERRIFLE("carob clip sniper rifle"),
    BOLT_CAGE("Bolt Cage"),
    PUMP_CLIP("Pump clip");

    public final String clip;


}



