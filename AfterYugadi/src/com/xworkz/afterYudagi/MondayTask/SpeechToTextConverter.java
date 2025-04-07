package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AISpeechToTextConverter;
import com.xworkz.afterYudagi.Internal.SpeechToText;

public class SpeechToTextConverter {
    public void Converter(SpeechToText speech)
    {
        speech.recordAudio();
        speech.convertToText();
        speech.detectLanguage();
        speech.applyPunctuation();
        speech.saveTranscription();

        if(speech instanceof AISpeechToTextConverter)
        {
            AISpeechToTextConverter aiSpeechToTextConverter=(AISpeechToTextConverter) speech;
            aiSpeechToTextConverter.convertor();
        }
    }
}
