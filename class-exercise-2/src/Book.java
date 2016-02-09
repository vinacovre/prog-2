public class Book
{
   protected int pages = 1500;

   //----------------------------------------------------------------
   //  Pages mutator.
   //----------------------------------------------------------------
   public void setPages(int numPages)
   {
      pages = numPages;
   }

   //----------------------------------------------------------------
   //  Pages accessor.
   //----------------------------------------------------------------
   public int getPages()
   {
      return pages;
   }
   
   public void printMethod()
   {
	   System.out.println("THIS IS IN THE CLASS BOOK");
   }
}