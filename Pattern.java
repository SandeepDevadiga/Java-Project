class Alphabets{
public static void main(String[] args)
{
int n = 7;
System.out.println("Alphabet A");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(((i==0||i==n/2)&&j<=n/2)||j==0||j==n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet B");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(((i==0||i==n/2||i==n-1)&&j<=n/2)||j==0||j==n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet C");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(((i==0||i==n-1)&&j<=n/2)||j==0)
	   	System.out.print(" * ");
	   else
	   	System.out.print(" ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");


System.out.println("Alphabet D");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(((i==0||i==n-1)&&j<=n/2)||j==0||j==n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet E");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(((i==0||i==n/2||i==n-1)&&j<=n/2)||j==0)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");


System.out.println("Alphabet F");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(((i==0||i==n/2)&&j<=n/2)||j==0)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");


System.out.println("Alphabet G");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
if(((i==0||i==n-1)&&j<=n/2)||j==0||(j==n/2||j==n-1)&&i>=n/2||i==n/2&&j>=n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");



System.out.println("Alphabet H");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if((j==0||j==n/2)||i==n/2&&j<=n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");


System.out.println("Alphabet I");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if((j==n/2||i==0||i==n-1))
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");


System.out.println("Alphabet J"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if((i==0||i==n-1&&j<=n/2||(j==0&&i>=n/2||j==n/2)))
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet K"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(j==n/2||i==j&&i>=n/2||i+j==n-1&&i<=n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet L"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(j==0||i==n-1&&j<=n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet M"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(j==0||j==n-1||i==j&&i<=n/2||i+j==n-1&&i<=n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet N"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(j==0||j==n-1||i==j)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet O"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(j==0||i==0||i==n-1||j==n-1)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet P"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(j==0||j==n/2&&i<=n/2||(i==0||i==n/2)&&j<=n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");


System.out.println("Alphabet Q"+"\n");
for(int i=0;i<n;i++)
	{ 
		for(int j=0;j<n;j++)
		{
			if((i==j&&j>=n/2)||(i==0||i==3*n/4)&&j<=3*n/4||(j==0||j==3*n/4)&&i<=3*n/4)
			{
				System.out.print(" * ");
			}
			else
				System.out.print("   ");
		}
		System.out.println();
	}
System.out.println("-----------------------------------");


System.out.println("Alphabet R"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if(j==n/2||i==0&&j>=n/2||i==j&&i>=n/2||i+j==n-1&&i<=n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("Alphabet S"+"\n");
for(int i = 0;i<n;i++)
{
	for(int j = 0;j<n;j++)
	{
	   if((i==0||i==n-1||i==n/2)&&j<=n/2||j==0&&i<=n/2||j==n/2&&i>=n/2)
	   	System.out.print(" * ");
	   else
	   	System.out.print("   ");
	   
	}
	System.out.println();
}
System.out.println("-----------------------------------");

System.out.println("T");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
		if(i==0||j==n/2)
			System.out.print(" * ");
		else
			System.out.print("   ");
		}
		System.out.println();
	}
System.out.println("-----------------------------------");
System.out.println("U");

	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
		if(j==0||j==n/2||i==n-1&&j<=n/2)
			System.out.print(" * ");
		else
			System.out.print("   ");
		}
		System.out.println();
	}
System.out.println("-----------------------------------");
System.out.println("V");
	int na=9;
	for(int i=0;i<na;i++)
	{ 
		for(int j=0;j<na;j++)
			if((i==j||i+j==na-1)&&i<=na/2)
			System.out.print("*");
			 else
			System.out.print(" ");
		System.out.println();
	}
System.out.println("-----------------------------------");

System.out.println("W"+"\n");

for(int i=0;i<n;i++)
	{ 
		for(int j=0;j<n;j++)
		{
			if(j==0||j==n-1||i==j&&i>=n/2||i+j==n-1&&j<=n/2)
			{
				System.out.print(" * ");
			}
			else
				System.out.print("   ");
		}
		System.out.println();
	}
System.out.println("-----------------------------------");

System.out.println("X"+"\n");

for(int i=0;i<n;i++)
	{ 
		for(int j=0;j<n;j++)
		{
			if(i==j||i+j==n-1)
			{
				System.out.print(" * ");
			}
			else
				System.out.print("   ");
		}
		System.out.println();
	}
System.out.println("-----------------------------------");

System.out.println("Y");

for(int i=0;i<n;i++)
	{ 
		for(int j=0;j<n;j++)
		{
			if(i==j&&j<=n/2||i+j==n-1)
			{
				System.out.print(" * ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
System.out.println("-----------------------------------");

System.out.println("Z"+"\n");

for(int i=0;i<n;i++)
	{ 
		for(int j=0;j<n;j++)
		{
			if((i==0||i==n-1)||i+j==n-1)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
System.out.println("-----------------------------------");




}

}
