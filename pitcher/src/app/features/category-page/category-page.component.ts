import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { DataService } from 'src/app/core/services/data.service';
import { listData } from 'src/app/shared/list';
import { Category } from 'src/app/shared/models/category';
@Component({
  selector: 'app-category-page',
  templateUrl: './category-page.component.html',
  styleUrls: ['./category-page.component.scss']
})
export class CategoryPageComponent implements OnInit {

  list = listData.reverse();
  @ViewChild('searchbar') searchbar!: ElementRef;
  searchText = '';

  toggleSearch: boolean = false;
  constructor() {
  }

  openSearch() {
    this.toggleSearch = true;
    this.searchbar.nativeElement.focus();
  }
  searchClose() {
    this.searchText = '';
    this.toggleSearch = false;
  }

  categories: Category[] = [];

  ngOnInit(): void {
    // this.dataService.getCategories().subscribe(categories => {
    //   this.categories = categories;
    // });
  }
}
