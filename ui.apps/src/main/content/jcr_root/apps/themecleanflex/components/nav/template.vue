<template>
  <themecleanflex-components-block v-bind:model="model">
    <div class="w-full">
      <div>
        <h4 v-html="model.title"></h4>
        <div class="menu" v-for="(item,i) in model.nav_item" :key="i">
          <a v-bind:href="item.url">
            <p v-html="item.title"></p>
          </a>
        </div>
      </div>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

