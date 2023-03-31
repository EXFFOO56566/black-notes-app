.class Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/samsung/android/sdk/pass/SpassFingerprint$IdentifyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->authenticate(La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;

.field final synthetic val$cancellationSignal:La/g/h/a;

.field final synthetic val$listener:Lb/b/a/b/a/b;

.field final synthetic val$restartCount:I

.field final synthetic val$restartPredicate:Lb/b/a/b/a/c$b;


# direct methods
.method constructor <init>(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;ILa/g/h/a;)V
    .locals 0

    iput-object p1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->this$0:Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;

    iput-object p2, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$listener:Lb/b/a/b/a/b;

    iput-object p3, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$restartPredicate:Lb/b/a/b/a/c$b;

    iput p4, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$restartCount:I

    iput-object p5, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$cancellationSignal:La/g/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private fail(Lb/b/a/b/a/a;ZII)V
    .locals 1

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->this$0:Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;

    invoke-static {v0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->access$000(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->fail(Lb/b/a/b/a/a;ZLjava/lang/String;I)V

    return-void
.end method

.method private fail(Lb/b/a/b/a/a;ZLjava/lang/String;I)V
    .locals 6

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$listener:Lb/b/a/b/a/b;

    const/4 v4, 0x2

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V

    if-eqz p2, :cond_0

    sget-object p2, Lb/b/a/b/a/a;->g:Lb/b/a/b/a/a;

    if-ne p1, p2, :cond_1

    :cond_0
    iget-object p2, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$restartPredicate:Lb/b/a/b/a/c$b;

    iget p3, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$restartCount:I

    invoke-interface {p2, p1, p3}, Lb/b/a/b/a/c$b;->a(Lb/b/a/b/a/a;I)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->this$0:Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;

    iget-object p2, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$cancellationSignal:La/g/h/a;

    iget-object p3, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$listener:Lb/b/a/b/a/b;

    iget-object p4, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$restartPredicate:Lb/b/a/b/a/c$b;

    iget v0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$restartCount:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, p2, p3, p4, v0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->access$100(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public onCompleted()V
    .locals 0

    return-void
.end method

.method public onFinished(I)V
    .locals 3

    if-eqz p1, :cond_5

    const/4 v0, 0x4

    const/4 v1, 0x1

    if-eq p1, v0, :cond_3

    const/16 v0, 0xc

    const/4 v2, 0x0

    if-eq p1, v0, :cond_2

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x64

    if-eq p1, v0, :cond_5

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    const/16 v0, 0x8

    if-eq p1, v0, :cond_4

    sget-object v0, Lb/b/a/b/a/a;->i:Lb/b/a/b/a/a;

    sget v2, Lcom/github/ajalt/reprint/module/spass/R$string;->fingerprint_error_hw_not_available:I

    goto :goto_1

    :cond_0
    sget-object v0, Lb/b/a/b/a/a;->e:Lb/b/a/b/a/a;

    sget v1, Lcom/github/ajalt/reprint/module/spass/R$string;->fingerprint_acquired_insufficient:I

    :goto_0
    invoke-direct {p0, v0, v2, v1, p1}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->fail(Lb/b/a/b/a/a;ZII)V

    goto :goto_2

    :cond_1
    sget-object v0, Lb/b/a/b/a/a;->h:Lb/b/a/b/a/a;

    sget v1, Lcom/github/ajalt/reprint/module/spass/R$string;->fingerprint_not_recognized:I

    goto :goto_0

    :cond_2
    sget-object v0, Lb/b/a/b/a/a;->e:Lb/b/a/b/a/a;

    sget v1, Lcom/github/ajalt/reprint/module/spass/R$string;->fingerprint_acquired_partial:I

    goto :goto_0

    :cond_3
    sget-object v0, Lb/b/a/b/a/a;->g:Lb/b/a/b/a/a;

    sget v2, Lcom/github/ajalt/reprint/module/spass/R$string;->fingerprint_error_timeout:I

    :goto_1
    invoke-direct {p0, v0, v1, v2, p1}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->fail(Lb/b/a/b/a/a;ZII)V

    :cond_4
    :goto_2
    return-void

    :cond_5
    iget-object p1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$1;->val$listener:Lb/b/a/b/a/b;

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Lb/b/a/b/a/b;->a(I)V

    return-void
.end method

.method public onReady()V
    .locals 0

    return-void
.end method

.method public onStarted()V
    .locals 0

    return-void
.end method
