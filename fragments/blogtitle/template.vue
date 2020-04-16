<template>
  <div v-bind:data-per-path="model.path">
    <h1>{{model.text}}</h1>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

