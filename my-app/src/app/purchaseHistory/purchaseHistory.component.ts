import { Component, OnInit } from '@angular/core';
import { items } from '../items';

@Component({
  selector: 'app-purchaseHistory',
  templateUrl: './purchaseHistory.component.html',
  styleUrls: ['./purchaseHistory.component.css']
})
export class PurchaseHistoryComponent implements OnInit {

  items = items;

  constructor() { }

  ngOnInit() {
  }

}
