var HomeManager = (function (){
    function homeManager(layui){
        this.$top = $("#layout_top");
        this.$left = $("#layout_left");
        this.$body = $("#layout_body");
        this.$bottom = $("#layout_bottom");
        this.$window = $(window);
        this.layui = layui;
    }

    homeManager.prototype.showTab = function (target){
        let self = this;
        let $target = $(target);
        let tabId = $target.attr("id") || new Date().valueOf();
        let $tabFrame = self.$body.find("li[lay-id=" + ("tab-" + tabId) + "]:first");
        let element = self.layui.element;
        if ($tabFrame.length == 0 && !!element) {
            let tabName = $target.text() || tabId;
            let tabUrl = "/" + tabId.replaceAll("_", "/");
            alert(tabUrl);
            let tabHeight = self.$window.height() - 185;
            let tabContent = '<iframe style="width:100%; height: ' + tabHeight + 'px" src="' + tabUrl + '" frameborder="0" scrolling="yes">';
            element.tabAdd('menu', {
                    title: tabName,
                    content: tabContent,
                    id: "tab-" + tabId
                }
            )
        }
        element.tabChange("menu", tabId);
    }

    homeManager.prototype.initTabEvents = function (){
        let self = this;
        let $tabs = self.$left.find("a[name='layui-nav-child-item']");
        if(!!$tabs.length){
            $tabs.unbind("click").bind("click", function (e){
                e.stopPropagation();
                self.showTab(this);
                return false;
            });

            let $firstTab = self.$left.find("a[name='layui-nav-child-item']:first");
            self.showTab($firstTab[0]);
        }
    }

    return homeManager;
})();



