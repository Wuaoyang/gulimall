<template>
  <div>
    <el-tree :data="menus" :props="defaultProps" @node-click="handleNodeClick"></el-tree>
  </div>
</template>

<script>
export default {
  name: "RenrenFastVueCategory",

  data() {
    return {
      menus: [],
      defaultProps: {
        children: "children",
        label: "name",
      },
    };
  },
  methods: {
    handleNodeClick(data) {
      console.log(data);
    },
    getMenus() {
      this.$http({
        url: this.$http.adornUrl("/product/category/list/tree"),
        method: "get",
      }).then((data) => {
        console.log("成功获取到菜单数据...", data.data);
        this.menus = data.data;
      });
    },
  },
  mounted() {
    this.getMenus();
  },
};
</script>

<style lang="scss" scoped>
</style>