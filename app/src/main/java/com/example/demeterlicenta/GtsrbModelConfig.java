package com.example.demeterlicenta;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class GtsrbModelConfig {
    public static String MODEL_FILENAME = "model.lite";

    public static final int INPUT_IMG_SIZE_WIDTH = 224;
    public static final int INPUT_IMG_SIZE_HEIGHT = 224;
    public static final int FLOAT_TYPE_SIZE = 4;
    public static final int PIXEL_SIZE = 3;
    public static final int MODEL_INPUT_SIZE = FLOAT_TYPE_SIZE * INPUT_IMG_SIZE_WIDTH * INPUT_IMG_SIZE_HEIGHT * PIXEL_SIZE;
    public static final int IMAGE_MEAN = 0;
    public static final float IMAGE_STD = 255.0f;

    public static final List<String> OUTPUT_LABELS = Collections.unmodifiableList(
            Arrays.asList(
                    "Limitare_viteza_20",
                    "Limitare_viteza_30",
                    "Limitare_viteza_50",
                    "Limitare_viteza_60",
                    "Limitare_viteza_70",
                    "Limitare_viteza_80",
                    "Sfarsit_Limitare_Viteza_80",
                    "Limitare_viteza_100",
                    "Limitare_viteza_120",
                    "Depasirea_interzisa",
                    "Depasirea_camioanelor_interzisa",
                    "Intersectie_drum_fara_prioritate",
                    "Drum_cu_Prioritate",
                    "Drum_fara_Prioritate",
                    "Stop",
                    "Circulatie_interzisa",
                    "Circulatia_camioanelor_interzisa",
                    "Accesul_interzis",
                    "Alte_pericole",
                    "Curba_la_Stanga",
                    "Curba_la_Dreapta",
                    "Curba_Dubla",
                    "Drum_cu_Denivelari",
                    "Acostament_Periculos",
                    "Atentie_Drum_Ingustat",
                    "Atentie_Lucrari",
                    "Atentie_Semafoare",
                    "Atentie_Pietoni",
                    "Atentie_Copii",
                    "Atentie_Biciclisti",
                    "Atentie_Grindina",
                    "Atentie_Animale",
                    "Sfarsitul_Restrictiilor",
                    "La_Dreapta",
                    "La_Stanga",
                    "Inainte",
                    "Inainte_sau_Dreapta",
                    "Inainte_sau_Stanga",
                    "Ocolire",
                    "Ocolire",
                    "Sens_Giratoriu",
                    "Sfarsitul_Interzicerii_Depasire",
                    "Sfarsitul_Interzicerii_Depasire_Camioane"
            ));

    public static final int MAX_CLASSIFICATION_RESULTS = 2;
    public static final float CLASSIFICATION_THRESHOLD = 0.1f;
}
