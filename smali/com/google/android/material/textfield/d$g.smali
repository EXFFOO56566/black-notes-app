.class Lcom/google/android/material/textfield/d$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AutoCompleteTextView$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/d;->c(Landroid/widget/AutoCompleteTextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/textfield/d;


# direct methods
.method constructor <init>(Lcom/google/android/material/textfield/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/d$g;->a:Lcom/google/android/material/textfield/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/d$g;->a:Lcom/google/android/material/textfield/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/material/textfield/d;->b(Lcom/google/android/material/textfield/d;Z)Z

    iget-object v0, p0, Lcom/google/android/material/textfield/d$g;->a:Lcom/google/android/material/textfield/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/google/android/material/textfield/d;->a(Lcom/google/android/material/textfield/d;J)J

    iget-object v0, p0, Lcom/google/android/material/textfield/d$g;->a:Lcom/google/android/material/textfield/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/material/textfield/d;->a(Lcom/google/android/material/textfield/d;Z)V

    return-void
.end method
