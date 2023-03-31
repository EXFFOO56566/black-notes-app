.class final Lcom/google/android/gms/internal/ads/jd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/gd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jd;->b:Lcom/google/android/gms/internal/ads/gd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jd;->b:Lcom/google/android/gms/internal/ads/gd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gd;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/jd;->b:Lcom/google/android/gms/internal/ads/gd;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/gd;->a(Lcom/google/android/gms/internal/ads/gd;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
