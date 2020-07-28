// DocSection: filtering_get_items_by_string
deliveryClient.items<ContentItem>()
  // Gets items whose Title element value equals to 'Hello World' 
  .equalsFilter('elements.title', 'Hello World')
  .toObservable()
  .subscribe(response => console.log(response));
// EndDocSection