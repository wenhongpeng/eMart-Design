import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PurchaseHistoryService } from '../purchase-history.service';
import { items } from '../items';

@Component({
  selector: 'app-purchaseHistory',
  templateUrl: './purchaseHistory.component.html',
  styleUrls: ['./purchaseHistory.component.css']
})
export class PurchaseHistoryComponent implements OnInit {

  items;

  constructor(private router: Router, private purchaseHistoryService:PurchaseHistoryService) { }

  ngOnInit() {
  }

  getPurchaseHistoryList() {
  //     // this.purchaseHistoryService.postSignIn(value).subscribe(
  //     //   data => {
  //     //     console.log(JSON.stringify(data));
  //     //     const info: any = data;
  //     //     if (200 === info.code) {
  //     //         console.log('Sign in success!');
  //     //         sessionStorage.setItem('token', info.result.token)
  //     //         this.router.navigate(['/products']);
  //     //     } else {
  //     //       console.log('Sign in ');
  //     //       this.alerts.push({type : 'danger', message: 'username or password error!'});
  //     //     }
  //     //   }
  //     // );
    this.items = items;// dummy data
  }

}
