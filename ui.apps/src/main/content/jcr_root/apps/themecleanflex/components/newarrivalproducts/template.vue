<template>
  <themecleanflex-components-block v-bind:model="model">
    <div>
      <h3>{{model.title}}</h3>
      <p>New Arrival Products will be shown here, please preview the Storefront.</p>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

