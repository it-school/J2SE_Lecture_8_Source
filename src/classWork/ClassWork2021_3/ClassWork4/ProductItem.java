package classWork.ClassWork2021_3.ClassWork4;

import java.util.Date;

public class ProductItem implements IItem, IProduct {
   public ProductItem() {
   }

   @Override
   public void SetInPPrice(float inPrice) {

   }

   @Override
   public void SetOutPPrice(float outPrice) {

   }

   @Override
   public void SetInDate(int year, int month, int day) {

   }

   @Override
   public float GetInPrice() {
      return 0;
   }

   @Override
   public float GetOutPrice() {
      return 0;
   }

   @Override
   public Date GetInDate() {
      return null;
   }

   @Override
   public void SetSelfPrice(float price) {

   }

   @Override
   public void SetTitle(String title) {

   }

   @Override
   public float GetSelfPrice() {
      return 0;
   }

   @Override
   public String GetTitle() {
      return null;
   }

   @Override
   public String toString() {
      return "ProductItem{}";
   }
}