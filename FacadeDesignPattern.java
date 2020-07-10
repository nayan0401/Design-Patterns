interface MobileStore
{
	public void productModel();
	public void productCost();

}

class OnePlus implements MobileStore
{
	public void productModel()
	{
		System.out.println("OnePlus 8");
	}

	public void productCost()
	{
		System.out.println("45000/-");
	}
}

class Apple implements MobileStore
{
	public void productModel()
	{
		System.out.println("IPhone 6");
	}

	public void productCost()
	{
		System.out.println("50000/-");
	}
}

class ShopOwner 
{
	MobileStore onePlus, apple;

	public ShopOwner()
	{
		onePlus = new OnePlus();
		apple = new Apple();
	}

	public void onePlusSale()
	{
		onePlus.productModel();
		onePlus.productCost();
	}

	public void appleSale()
	{
		apple.productModel();
		apple.productCost();
	}
}

public class Main 
{ 
	public static void main(String args[]) 
	{ 
		ShopOwner owner = new ShopOwner();	
		
		owner.onePlusSale();
		System.out.println();
		owner.appleSale();
		
	} 
} 
