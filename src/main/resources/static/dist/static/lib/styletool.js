var esriMap = new Cesium.ArcGisMapServerImageryProvider({
    url:'https://services.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer',
    enablePickFeatures:false
});
//初始化地图容器
     
    Window.viewer = new Cesium.Viewer("cesiumContainer",{
    baseLayerPicker : false,
    geocoder:false,    //搜索框
    homeButton:false,
    sceneModePicker:false, //二三维转换
    animation:false,
    timeline:false,
    fullscreenButton:false,
    infoBox:false,
    shouldAnimate: true,   //雨雪效果
    navigationHelpButton: false,
    navigationInstructionsInitiallyVisible: false,
    // selectedImageryProviderViewModel:vmodels[6],
    vrButton:false,
    // terrainProvider:terrainProvider,
    //terrainProvider: Cesium.createWorldTerrain(),
    infoBox:true,
    imageryProvider : esriMap,

  });
    //   viewer._cesiumWidget._creditContainer.style.display = "none";// 隐藏版权
      //取消左键双击事件
    viewer.cesiumWidget.screenSpaceEventHandler.removeInputAction(Cesium.ScreenSpaceEventType.LEFT_DOUBLE_CLICK);
    alert('123');