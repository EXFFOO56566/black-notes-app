.class final synthetic Lcom/google/android/gms/internal/ads/zl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/xl;

.field private final c:I

.field private final d:I

.field private final e:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/xl;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zl;->b:Lcom/google/android/gms/internal/ads/xl;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zl;->c:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zl;->d:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/zl;->e:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zl;->b:Lcom/google/android/gms/internal/ads/xl;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zl;->c:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zl;->d:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/zl;->e:I

    move-object v4, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/xl;->a(IIILandroid/content/DialogInterface;I)V

    return-void
.end method
