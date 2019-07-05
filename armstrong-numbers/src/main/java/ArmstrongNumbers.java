class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int digits = numberOfDigits(numberToCheck);

		int sum = 0,actualnumber=numberToCheck;

		while(actualnumber>0)
		{
			int digit = actualnumber % 10;
			sum += Math.pow(digit,digits);
			actualnumber = actualnumber /10 ;
		}
		if(sum==numberToCheck)
			return true;
		return false;

	}

	int numberOfDigits(int numberToCheck)
	{
		return Integer.toString(numberToCheck).length();
	}


}
