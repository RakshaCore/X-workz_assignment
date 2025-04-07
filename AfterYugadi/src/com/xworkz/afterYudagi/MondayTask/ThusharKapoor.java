package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AILanguageTranslator;
import com.xworkz.afterYudagi.Internal.Translator;

public class ThusharKapoor {
    public void translator(Translator translator)
    {
        translator.detectLanguage();
        translator.translateText();
        translator.providePronunciation();
        translator.suggestAlternativeWords();
        translator.saveTranslationHistory();

        if(translator instanceof AILanguageTranslator)
        {
            AILanguageTranslator aiLanguageTranslator=(AILanguageTranslator) translator;
            aiLanguageTranslator.askThusharKapoor();
        }
    }
}
