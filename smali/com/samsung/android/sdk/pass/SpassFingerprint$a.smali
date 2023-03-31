.class final Lcom/samsung/android/sdk/pass/SpassFingerprint$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/samsung/android/sdk/pass/SpassFingerprint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/samsung/android/sdk/pass/SpassFingerprint$a;->a:Landroid/os/Bundle;

    const-string v1, "sdk_version"

    const-string v2, "Pass-v1.2.6"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/SpassFingerprint$a;->a:Landroid/os/Bundle;

    return-object v0
.end method

.method public final a([I)Lcom/samsung/android/sdk/pass/SpassFingerprint$a;
    .locals 2

    array-length v0, p1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/samsung/android/sdk/pass/SpassFingerprint$a;->a:Landroid/os/Bundle;

    const-string v1, "request_template_index_list"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    :cond_0
    return-object p0
.end method
