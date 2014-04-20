package com.shayanshaikh.crystalball;

import java.util.Random;

public class MagicBall {
	// Member variables (properties about the object)
	public String[] mAnswers = { 
			"It is certain", 
			"It is plausible",
			"All signs say YES!", 
			"The stars are not aligned",
			"My reply is no", 
			"It is doubtful",
			"Better not tell you now", 
			"Concentrate and Ask again",
			"I don't understand?",
			"Yes",
			"No",
			"Nah Bro",
			"Sure Bro",
			"What did you say?",
			"Woah Bro I don't wanna answer that",
			"That is unlikely",
			"The truth is within you",
			"The truth will be revealed in time",
			"Ouucchhh, What's with the shaking?",
			"The things you tell me...",
			"Well, umm....            Huh?",
			"You could say so",
			"I'm not really sure",
			"You could be onto something",
			"On the advice of my counsel I herby I invoke my right under the Fifth Amendment not to answer"
	};
	
	// Methods (abilities: things the object can do)
	public String getAnAnswer() { 

		String answer = "";
		
		// Randomly select one of three answers: Yes, No, or Maybe
		Random randomGenerator = new Random(); // Construct a new Random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		
		return answer;
	}
}
