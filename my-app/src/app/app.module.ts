import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { BuyerSignupComponent } from './buyer-signup/buyer-signup.component';
import { SellerSignupComponent } from './seller-signup/seller-signup.component';
import { SearchComponent } from './search/search.component';
import { SearchResultComponent } from './searchResult/searchResult.component';
import { ItemDetailComponent } from './itemDetail/itemDetail.component';
import { CartComponent } from './cart/cart.component';
import { PurchaseHistoryComponent } from './purchaseHistory/purchaseHistory.component';
import { ItemAddComponent } from './itemAdd/itemAdd.component';
import { ViewstockComponent } from './viewstock/viewstock.component';
import { ReportComponent } from './report/report.component';
import { TopBarComponent } from './top-bar/top-bar.component';

@NgModule({
   declarations: [
      AppComponent,
      LoginComponent,
      BuyerSignupComponent,
      SellerSignupComponent,
      SearchComponent,
      SearchResultComponent,
      ItemDetailComponent,
      SearchResultComponent,
      CartComponent,
      PurchaseHistoryComponent,
      ItemAddComponent,
      ViewstockComponent,
      ReportComponent,
      TopBarComponent
   ],
   imports: [
      BrowserModule,
      AppRoutingModule
   ],
   providers: [],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
