import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemaddService } from '../itemAdd.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-viewstock',
  templateUrl: './viewstock.component.html',
  styleUrls: ['./viewstock.component.css']
})
export class ViewstockComponent implements OnInit {

  constructor(private router: Router, private itemaddService: ItemaddService) { }

  ngOnInit() {
  }

  onSubmit(value: any) {
    // if (this.validInput(value)) {
  //     // this.itemaddService.postViewStock(value).subscribe(
  //     //   data => {
  //     //     console.log(JSON.stringify(data));
  //     //     const info: any = data;
  //     //     if (200 === info.code) {
  //     //         console.log('Sign in success!');
                    // $("#noOfStockItems").val(data.noOfStockItems);
                    // $("#noOfSoldItems").val(data.noOfSoldItems);
  //     //     } else {
  //     //       console.log('Sign in ');
  //     //       this.alerts.push({type : 'danger', message: 'username or password error!'});
  //     //     }
  //     //   }
  //     // );
      console.log('Item Add Success');
  // }
  }

}
